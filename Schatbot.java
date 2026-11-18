package schatbot;
import java.util.Scanner;
public class Schatbot {
//Advincula = A = school
    public static void main(String[] args)throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String Y ="Y";
        //1
        System.out.println("---------------Joe Erlano Colllege Chat Bot---------------");
        Thread.sleep(550);
        System.out.println("Kuya Bot: Hi! I am Kuya Bot!");
        Thread.sleep(500);
        System.out.println("Kuya Bot: What is your name?");
        System.out.print("Unknown: ");
        String name = input.nextLine();
        //2
        Thread.sleep(1000);
        System.out.println("Kuya Bot: Hi "+name+", What year are you in college?");
        System.out.print(name+": ");
        String year = input.nextLine();
        Thread.sleep(1000);
        if (year.equalsIgnoreCase("1st year")|| year.equalsIgnoreCase("First year")|| year.equalsIgnoreCase("1")|| year.equalsIgnoreCase("1st")|| year.equalsIgnoreCase("first")){
            System.out.println("Kuya Bot: You still have a long way to go, but you can do it!!");
        }
        else if (year.equalsIgnoreCase("2nd year")|| year.equalsIgnoreCase("Second Year")|| year.equalsIgnoreCase("2")|| year.equalsIgnoreCase("2nd")|| year.equalsIgnoreCase("second")){
            System.out.println("Kuya Bot: Keep going at this pace, you will finish school in no time!!");
        }
        else if (year.equalsIgnoreCase("3nd year")|| year.equalsIgnoreCase("Third Year")|| year.equalsIgnoreCase("3")|| year.equalsIgnoreCase("3rd")|| year.equalsIgnoreCase("third")){
            System.out.println("Kuya Bot: Your almost there, keep at it!!");
        }
        else if (year.equalsIgnoreCase("4th year" )|| year.equalsIgnoreCase("Fourth year")|| year.equalsIgnoreCase("4")|| year.equalsIgnoreCase("4th")|| year.equalsIgnoreCase("fourth")){
            System.out.println("Kuya Bot: Congratulations, you have worked really hard to get this far!");
        }
        else{
            System.out.println("Kuya Bot: Ok then, keep your secret");
        }
        //3
        Thread.sleep(1000);
        System.out.println("Kuya Bot: What is your Course?");
        System.out.print(name+": ");
        String course = input.nextLine();
        Thread.sleep(1000);
        if(course.equalsIgnoreCase("BSCPE")|| course.equalsIgnoreCase("computer engineering")|| course.equalsIgnoreCase("cpe")){
            System.out.println("Kuya Bot: That is a hard one, I'm sure you have no girlfriend haha");
        }
        else if(course.equalsIgnoreCase("BSIT")|| course.equalsIgnoreCase("Information technology")|| course.equalsIgnoreCase("it")){
            System.out.println("Kuya Bot: That is a great choice!!");
        }
        else if (course.equalsIgnoreCase("BSHM")|| course.equalsIgnoreCase("Hospitality Management")|| course.equalsIgnoreCase("hm")){
            System.out.println("Kuya Bot: Good luck, make sure to manage your future properly!");
        }
        else if (course.equalsIgnoreCase("BSBA")|| course.equalsIgnoreCase("Business Administration")|| course.equalsIgnoreCase("ba")){
            System.out.println("Kuya Bot: That is a good choice!");
        }
        else{
            System.out.println("Kuya Bot: We don't have that Course here....sorry");
        }
        //4
        Thread.sleep(800);
        System.out.println("Kuya Bot: Anyway, let us get to the main topic, what brings you here?");
        Thread.sleep(700);
        System.out.println("Kuya Bot: Are you here to REPORT, ENROLL, or is it regarding TUITION?");
        System.out.print(name+": ");
        String topic = input.nextLine();
        Thread.sleep(1000);
        if(topic.equalsIgnoreCase("Report")){
            System.out.println("Kuya Bot: Please send the report to our email (JoeAcad@yahoo.com), where it will be evaluated properly.");
            Thread.sleep(800);
            System.out.println("Kuya Bot: Do not worry, the report will be treated anonymously");
        }
        else if(topic.equalsIgnoreCase("Enroll")){
            System.out.println("Kuya Bot: You can enroll via our website or you ca go to the campus and enroll in person.");
            Thread.sleep(800);
            System.out.println("Kuya Bot: Our website is JoeAcad.com if you want to enroll online.");
        }
        else if(topic.equalsIgnoreCase("Tuition")){
            System.out.println("Kuya Bot: Please go to the campus and find the cashier.");
            Thread.sleep(800);
            System.out.println("Kuya Bot: You can ask the cashier all about the tuition in great detail.");
        }
        else{
            System.out.println("Kuya Bot: None of those?.... Ok");
        }
        //5
        Thread.sleep(1000);
        System.out.println("Kuya Bot: Would you like me repeat my previous question?");
        Thread.sleep(800);
        System.out.println("Kuya Bot: If yes, press 'Y' and if no, press any key.");
        System.out.print(name+": ");
        String des = input.nextLine();
        while(des.equalsIgnoreCase(Y)||des.equalsIgnoreCase("yes")){
            System.out.println("Kuya Bot: Are you here to REPORT, ENROLL, or is it regarding your TUITION?");
            System.out.print(name+": ");
            String topic2 = input.nextLine();
            Thread.sleep(1000);
            if(topic2.equalsIgnoreCase("Report")){
                System.out.println("Kuya Bot: Please send the report to our email (JoeAcad@yahoo.com), where it will be evaluated properly.");
                Thread.sleep(500);
                System.out.println("Kuya Bot: Do not worry, the report will be treated anonymously");
        }
            else if(topic2.equalsIgnoreCase("Enroll")){
                System.out.println("Kuya Bot: You can enroll via our website or you ca go to the campus and enroll in person.");
                Thread.sleep(800);
                System.out.println("Kuya Bot: Our website is JoeAcad.com if you want to enroll online.");
        }
            else if(topic2.equalsIgnoreCase("Tuition")){
                System.out.println("Kuya Bot: Please go to the campus and find the cashier.");
                Thread.sleep(800);
                System.out.println("Kuya Bot: You can ask the cashier all about the tuition in great detail.");
        }
            else{
                System.out.println("Kuya Bot: None of those?.... Ok");
        }
            Thread.sleep(1000);
            System.out.println("Kuya Bot: Would you like me repeat my previous question?");
            Thread.sleep(800);
            System.out.println("Kuya Bot: If yes, press 'Y' and if no, press any key.");
            System.out.print(name+": ");
            String des2 = input.nextLine();
            if(des2.equalsIgnoreCase(Y)||des2.equalsIgnoreCase("Yes")){               
            }
            else{
                break;
            }
        }
            
        Thread.sleep(800);
        System.out.println("Kuya Bot: Bye, chat again with me if you need anything.");
    }
    
}
