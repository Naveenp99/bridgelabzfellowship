package com.bridgelabz.patternprograms;

import java.io.IOException;
//  import java.CommandExecutor
public class ProxyDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

	public interface CommandExecutor {

		public void runCommand(String cmd) throws Exception;
	}
	
	public static class CommandExecutorImpl implements CommandExecutor {

		@Override
		public void runCommand(String cmd) throws IOException {
	                //some heavy implementation
			Runtime.getRuntime().exec(cmd);
			System.out.println("'" + cmd + "' command executed.");
		}

	}
	
	public static class CommandExecutorProxy implements CommandExecutor {

		private boolean isAdmin;
		private CommandExecutor executor;
		
		public CommandExecutorProxy(String user, String pwd){
			if("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) isAdmin=true;
			executor = new CommandExecutorImpl();
		}
		
		@Override
		public void runCommand(String cmd) throws Exception {
			if(isAdmin){
				executor.runCommand(cmd);
			}else{
				if(cmd.trim().startsWith("rm")){
					throw new Exception("rm command is not allowed for non-admin users.");
				}else{
					executor.runCommand(cmd);
				}
			}
		}

	}
	
}
