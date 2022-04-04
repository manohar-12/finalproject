package finalproject;
import java.io.*;
import java.util.*;
public class virtualKey {
	public static void main(String[] args) throws IOException{
        System.out.println("\n**********************************************\n");
        System.out.println("\tHELLO USER........ \n");
        System.out.println("\n\tWELCOME TO");
       System.out.println("\tVIRTUAL KEY REPOSITORIES....");
       System.out.println("\n\n\t\t\t\tDeveloped by");
       System.out.println("\t\t\t\tKatta Manohar Yadav");
        System.out.println("************************************************");
        optionsSelection();
      }
	public static void optionsSelection() throws IOException{
		String[] arr = {"1. Retrieve the string in ascending order:",
						"2. business level operation menu:",
						"3. exit from the application:"};
		Scanner sc=new Scanner(System.in);
		for(String s:arr)
			System.out.println(s);
		System.out.println("\nEnter your choice which you want to select:");
		
try {
		int opt=sc.nextInt();

			
				switch(opt) {
				case 1:
					System.out.println("Enter the directory to retieve all the files:");
					Scanner sc1=new Scanner(System.in);
					String repos=sc1.nextLine();
					try {
						File f=new File(repos);
						String[] fileList=f.list();
						ArrayList<String> list1=new ArrayList<>();
						for(String k:fileList) {
							list1.add(k);
						}
				Collections.sort(list1);
				for(String l1:list1)
				System.out.println(l1+"\n");
				System.out.println("\n all files retrieved successfully.........");
				System.out.println("*********************************************");
				System.out.println("\n");
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Enter Correct path:");
						System.out.println("**************************************");
						System.out.println("\n");
					}
					optionsSelection();
					break;
				
				case 2:
					try {
						optionsSelection1();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("\n");
					optionsSelection();
					break;	
				case 3:
					System.out.println("exited from the file management system successfully.....");
					System.out.println("*********************************************************");
					break;
				default:
					System.out.println("choose the correct option (1/2/3).....only");
					System.out.println("********************************************");
					optionsSelection();
					break;
					}
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("Enter Numerical value only:");
	optionsSelection();
}
				
			
		}
	public static void optionsSelection1() throws IOException {
		String[] arr3= {"1. Add a file and its content to a directory",
						"2. Delete a file form the directory:",
						"3. Searching a file and showing its content in a directory",
						"4. Exit from the business level :"
		
		};
		int arr[]= {1,2,3,4};
		for(String s:arr3)
			System.out.println(s);
		System.out.println("\nEnter your choice:");
		Scanner sc=new Scanner(System.in);
		try {
		int opt=sc.nextInt();
		
				switch(opt) {
				case 1:
					Scanner sc1=new Scanner(System.in);
					System.out.println("Enter the file to add....");
					try {
						String file=sc1.nextLine();
						File f=new File(file);
						if(f.createNewFile()) {
							System.out.println("file created successfully......");
							System.out.println("do you want to enter something into the file:"
									+ "\n"+"press 1 to write ..."+"\n"+"press 0 to exit.....");
							int n=sc.nextInt();
							if(n==1) {
								System.out.println("enter the data to enter into the file....");
								Scanner sc2=new Scanner (System.in);
								String text=sc2.nextLine();
								try {
								FileWriter writer =new FileWriter(f);
								writer.write(text);
								writer.close();
								System.out.println("file written successfully.....");
								
							
								}catch (IOException e) {
									System.out.println("error occured while wrting a file....");
								}
							}
						}
						else {
							System.out.println("file already exists..");
						}
						
					}catch (IOException e) {
					System.out.println("Enter the path correctly....");
					}
					
					System.out.println("******************************************");
					optionsSelection1();
					break;
				case 2:
					System.out.println("Enter the repository to delete the file.....");
					Scanner sc3=new Scanner(System.in);
					String file =sc3.nextLine();
						try {
							File f =new File(file);
							
								if(f.delete()) {
									System.out.println(f.getName()+" file deleted suceesfully......");
								}else
									System.out.println("there is no such file to delete..");
					
						}catch (Exception e) {
						System.out.println("error occured while deleting a file.....");
						}
					System.out.println("*******************************************");
					optionsSelection1();
				    break;
				case 3:
					Scanner sc4=new Scanner(System.in);
					System.out.println("enter the repository:");
					String repos=sc4.nextLine();
					try {
						File f=new File(repos);
						String[] file1=f.list();
						System.out.println("Enter the file name to search:");
						String input=sc4.nextLine();
						int flag=0;
						for(String s:file1) {
							if(s.equals(input)) {
								flag=1;
								break;
							}
						}
						if(flag==1) {
							
					try {
						File file3=new File(repos+"\\"+input);
						 Scanner reader=new Scanner(file3);
						 while(reader.hasNextLine()) {
							 String data=reader.nextLine();
							 System.out.println(data);
							 
						 }
						 reader.close();
						 System.out.println(input+" file searched and contents showed  successfully");
					}catch (Exception e) {
						System.out.println("error while showing the content");
					}
						}else
							System.out.println(input+" file not found");
					}catch (Exception e) {
						System.out.println("Enter the path correctly...");
					}
					
				     System.out.println("*******************************************");
				     
				     optionsSelection1();
				     break;
				case 4:
					System.out.println("exited from the Business level operation success fully");
					System.out.println("*******************************************************");
					break;
					default:
						System.out.println("choose the correct option (1/2/3/4) only................");
						System.out.println("*********************************************************");
						optionsSelection1();
						break;
				}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter numerical value only...");
			System.out.println("**************************************");
			optionsSelection1();
		}
	}
	
	
	}

