package au.com.addstar.bc.sync;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ConfigReceiveEvent extends Event
{
	private static HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers()
	{
		return handlers;
	}
	
	public static HandlerList getHandlerList()
	{
		return handlers;
	}

	private SyncConfig mConfig;
	private String mName;
	
	public ConfigReceiveEvent(String name, SyncConfig config)
	{
		mName = name;
		mConfig = config;
	}
	
	public String getName()
	{
		return mName;
	}
	
	public SyncConfig getConfig()
	{
		return mConfig;
	}
}
