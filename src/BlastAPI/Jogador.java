package BlastAPI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.gabrielblink.usertype.JogadorUser;

public class Jogador extends JavaPlugin{

	public static String getFac(Player p){
	   return JogadorUser.get(p.getName()).getFaction();
	}
	public static double getPoder(Player p){
		return JogadorUser.get(p.getName()).getPoder();
	}
	public static int getDeaths(Player p){
		return JogadorUser.get(p.getName()).getDeaths();
	}
	
}
