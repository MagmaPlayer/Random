package fr.random.nk.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class witze implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String lust;
        lust = "I don't feel like talking to you right now at this point";
        String hol;
        hol = "Farewell because your head is holy";
        String zeit;
        zeit = "There is always only a moment between too early and too late.";
        String zufal;
        zufal = "Coincidence is a word without meaning \n nothing can exist without causes.";
        //Zwei string ein witz//
        String code;
        code = "If my code works";
        String touch;
        touch = "DO NOT TOUCH IT";
        // bis hier//
        String pla;
        pla = "You are playing Minecraft!";
        String dev;
        dev = "You know? MagmaPlayer is the developer from this Plugin";
        String opi;
        opi = "In my opinion Ice Tea Peach ist better then Lemon";
        String ver;
        // Hinzufüger
        ver = "Pls do not forgot!";
        //
        String wood;
        wood = "Where there is no more wood, the fire goes out. \n and where there is no more gossip, the argument stops.";
        String time;
        time = "What time is it?";
        String deve;
        deve = "I wouldn't exist without my developer";
        String piz;
        piz = "Only a pizza from the Italian is a really good pizza.";
        String las;
        las = "The last is always the best";


        Random num = new Random();
        int a;
        int lob;
        for (int i=0; i<1; i++){
            a = 1 + num.nextInt(15);
            String witz = String.valueOf(a);


            switch(witz){
                case "1": commandSender.sendMessage(ChatColor.GOLD + hol); System.out.println(1); break;
                case "2": commandSender.sendMessage(ChatColor.GOLD + zeit); System.out.println(2); break;
                case "3": commandSender.sendMessage(ChatColor.GOLD + zufal); System.out.println(3); break;
                case "4": commandSender.sendMessage(ChatColor.GOLD + code + ChatColor.RED + " " + touch); System.out.println(4); break;
                case "5": commandSender.sendMessage(ChatColor.GOLD + pla); System.out.println(5); break;
                case "6": commandSender.sendMessage(ChatColor.RED + ver + " " + ChatColor.GOLD + dev); System.out.println(6); break;
                case "7": commandSender.sendMessage(ChatColor.GOLD + opi); System.out.println(7); break;
                case "8": commandSender.sendMessage(ChatColor.GOLD + wood); System.out.println(8); break;
                case "9": commandSender.sendMessage(ChatColor.GOLD + time); System.out.println(9); break;
                case "10": commandSender.sendMessage(ChatColor.RED + ver + " " + ChatColor.GOLD + deve); System.out.println(10); break;
                case "11": commandSender.sendMessage(ChatColor.GOLD + piz); System.out.println(11); break;
                case "12": commandSender.sendMessage(ChatColor.GOLD + las); System.out.println(12); break;
                default: commandSender.sendMessage(ChatColor.RED + lust); System.out.println(13); break;
            }

        }

        return false;
    }
}


