public class Main {
	
	public static void main(String[] args) {
		boolean enableOutput = true;
		boolean outputToFile = true;
		
		String inputFolder ="../workload/planetlab";
		String outputFolder = "output";
		
//		if (args.length != 4) {
//			System.err.println("Masukkan argumen dengan benar (4)");
//			return;
//		}
		
		String workload = "20110303"; // PlanetLab workload
		String vmAllocationPolicy = "mad"; // Inter Quartile Range (IQR) VM allocation policy
		String vmSelectionPolicy = "mc"; // Maximum Correlation (MC) VM selection policy
		String parameter = "1.5"; // the safety parameter of the IQR policy

//		String workload = args[0];
//		String vmAllocationPolicy = args[1];
//		String vmSelectionPolicy = args[2];
//		String parameter = args[3];
		
		new PlanetLabRunner(
				enableOutput,
				outputToFile,
				inputFolder,
				outputFolder,
				workload,
				vmAllocationPolicy,
				vmSelectionPolicy,
				parameter);
	}

}
