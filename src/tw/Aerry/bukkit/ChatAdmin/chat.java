package tw.Aerry.bukkit.ChatAdmin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;



public class chat extends JavaPlugin implements Listener{

	//�T��

	@EventHandler
	  public void onPlayerChatEvent(AsyncPlayerChatEvent e){
			
		  for(String word : e.getMessage().split(" ")){
			
			  if(getConfig().getStringList("Ban").contains(word)){

				  e.setCancelled(true);
				  e.getPlayer().sendMessage(getConfig().getString("WarMess"));
				  
			  }
		  }
	  }
	    
		  public void onEnable(){
	
			
			  getConfig().options().copyDefaults(true);
			  saveConfig();
			  Bukkit.getServer().getPluginManager().registerEvents(this, this);
			  Bukkit.getServer().getLogger().info("[ChatAdmin]�Ұʤ�....");
			  Bukkit.getServer().getLogger().info("[ChatAdmin]�}��!");
			  
			  
		  }
	    
		  public void onDisable(){
			  
		  }

		
			public boolean onCommand(CommandSender sender,Command cmd,String cmdlable,String[] args){
				Player p = (Player) sender;
				if(cmdlable.equalsIgnoreCase("aerrychrl")){
					p.sendMessage("[ChatAdmin]���sŪ��....");
				    reloadConfig();
				    
				}
				
				 return false;
			}
}
				  
				