package onepoint.bowling;

/**
 * 
 * @author Patrick LY
 *
 */
public class Bowling {
	
	/**
	 * Constructor 
	 */
	public Bowling() {}
	
	
	/**
	 * calculate to calculate the score
	 * @param frame
	 * @return int
	 */
	public int calculate(String[] line) {
		
		int score = 0;
		int lineLength = line.length;
		for(int i =0; i< 10; i++) {
			
			String frame ="";
			String followFrame ="";
			String sdFollowFrame ="";
			
			frame = line[i];

			if(frame.length() == 2) {
				int point =0;
				String event ="";
				point = Integer.parseInt(frame.substring(0, 1));
				event = frame.substring(1, 2);
				
				if(i<(line.length -1)) {
					followFrame = line[i+1];
					if(followFrame.contains("/")) {
						point = point + 10;
					}
				}

				
				score = score + point;
				System.out.println("score = "+score);
			}			
			else if(frame.length() == 1) {
				int point =0;
				String event ="";
				event = frame.substring(0, 1);
	
				if(event.equals("X")) {
					point = point + 10;
				}
				if(i<line.length) {
					followFrame = line[i+1];
					sdFollowFrame = line[i+2];
					if(followFrame.equals("X")) {
						point = point + 10;
					}
					if(followFrame.equals("X")) {
						point = point + 10;
					}
				}

				
				score = score + point;
				System.out.println("score = "+score);
			}
			
		}
		System.out.println("final score = "+score);
		return score;
		
	}
}
