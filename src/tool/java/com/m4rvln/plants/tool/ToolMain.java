package com.m4rvln.plants.tool;

import com.m4rvln.plants.common.blocks.ModCropBlock;
import com.m4rvln.plants.common.registries.BlockRegistry;
import com.m4rvln.plants.common.registries.ItemRegistry;
import com.m4rvln.plants.common.registries.Registration;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import net.minecraft.SharedConstants;
import net.minecraft.data.Main;
import net.minecraft.server.Bootstrap;

class ToolMain {

    public static void main(String args[]) throws IOException {
        JFrame frame = new JFrame("Plants Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 786);
        frame.setVisible(true);

        JButton button = new JButton("Generate Resource Files");
        button.setSize(200, 80);
        button.addActionListener(e -> ToolMain.generateResourcesForCrops());
        frame.getContentPane().add(button);

        // Setup minecraft
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
        Bootstrap.validate();

        try {
            Class.forName(BlockRegistry.class.getName());
            Class.forName(ItemRegistry.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void generateResourcesForCrops() {

        Registration.BLOCKS.getEntries().forEach(e -> {
            if (e.getId().getNamespace().equals("plants") && e.get() instanceof ModCropBlock) {
                System.out.println(e.getId().getPath());
            }
        });
    }
}