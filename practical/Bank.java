package corejava;
		
		public interface Bank {
			float rateofinterest();
		}
		
		class SBI implements Bank{
			
			public float rateofinterest() {
				
				return 9.15f;	
			}
		}
		class PNB implements Bank{
			
			public float rateofinterest() {
				return 9.7f;
			}
		}
		
		class TestInterface2{
				public static void main(String[] args) {
					
					Bank b 	 = new SBI();
					System.out.println("ROI:"+b.rateofinterest());
					
					
				}
		}