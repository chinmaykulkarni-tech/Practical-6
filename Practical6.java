public class Practical6{
	public static void main(String args[]){
		int size=10;
		Practical61(size);
		Practical62(size);
		Practical63(size);
		}
	public static void Practical61(int size){
		for(int line=1;line<=size;line++){
		   for(int space=size-line;space>0;space--){
		   	System.out.print("  ");
		   	}
		   for(int star=2*line-1;star>0;star--){
			System.out.print("+ ");
			}
			
			System.out.print("\n");
		}
		for(int line=size-1;line>=1;line--){
		   for(int space=size-line;space>0;space--){
		   	System.out.print("  ");
		   	}
		   for(int star=2*line-1;star>0;star--){
			System.out.print("+ ");
			}
			System.out.print("\n");
		}
	}
	public static void Practical62(int size){
		for(int line=1;line<=size;line++){
                   for(int space=size-line;space>0;space--){
                       System.out.print(" ");
                    }
                for(int element=(line+(line-1));element>0;element--){
                   if(element%2!=0){
                  System.out.print("+");
                   }
                   else{
                  System.out.print(" ");
                   }
                }
          System.out.print("\n");
      }

		 for(int line=size-1;line>1;line--){
                     for(int space=size-line;space>0;space--){
                         System.out.print(" ");
                  }
                 for(int element=(line+(line-1));element>0;element--){
                 if(element%2!=0){
                         System.out.print("*");
                   }
              else{
                  System.out.print(" ");
                  }
                }
          System.out.print("\n");
          }
     }
     public static void Practical63(int size){
		for(int line=1;line<=size;line++){
                   for(int space=size-line;space>0;space--){
                        System.out.print(" ");
                   }
                    for(int element=2*line-1;element>0;element--){
                          if(element==line+1 || element ==line-1){
                               System.out.print("+"); 
                             }     
                         else {
                               System.out.print("*");
                               }
                    }

                         System.out.print("\n");
                 }
                     for(int line=size;line>=0;line--){
                          for(int space=size-line;space>0;space--){
                               System.out.print(" ");}
                          for(int element=2*line-1;element>0;element--){
                               if(element==line+1 || element ==line-1){
                                     System.out.print("*"); 
                                  }     
                               else {
                                     System.out.print("+");
                                     }
                           }

                        System.out.print("\n");
                  }
     }
}

			
