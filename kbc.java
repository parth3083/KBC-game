import java.util.*;

class question_and_answers {
    LinkedHashMap<Integer, String> answer_1 = new LinkedHashMap<>();
    int score = 0;
    int a;
    boolean answer = true;

    public void question() {
        Scanner sc = new Scanner(System.in);
        if (answer == true) {
            System.out.println();
            System.out.println("Question 1 for Rs.1000");
            System.out.println();
            System.out.println("1.Which of the following correspondes to *Ek bataa toh*?");
            System.out.println();
            answer_1.put(1, "Pura");
            answer_1.put(2, "Sawa");
            answer_1.put(3, "Adha");
            answer_1.put(4, "Pauna");
            System.out.println();
            System.out.println(answer_1);
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Adha") {
                score = 1000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Adha*");
                answer = false;
                System.out.println("Your score is Rs. : " + score);
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();
            System.out.println("Question 2 for Rs.2000");
            System.out.println();
            System.out.println("2.Which of the following gods is known as *Gauri Nandan*?");
            System.out.println();
            answer_1.put(1, "Agni");
            answer_1.put(2, "Indra");
            answer_1.put(3, "Hanuman");
            answer_1.put(4, "Ganesha");
            System.out.println();
            System.out.println(answer_1);
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Ganesha") {
                score = 2000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Ganesha*");
                answer = false;
                System.out.println("Your score is Rs. 0");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 3 for Rs.3000");
            System.out.println();
            System.out.println("In the game of ludo the discs or tokens are of how many colours?");
            System.out.println();
            answer_1.put(1, "One");
            answer_1.put(2, "Two");
            answer_1.put(3, "Three");
            answer_1.put(4, "Four");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Four") {
                score = 3000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Four*");
                answer = false;
                System.out.println("Your score is Rs. 0");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 4 for Rs.5000");
            System.out.println();
            System.out.println("Which of these are names of national parks located in Madhya Pradesh?");
            System.out.println();
            answer_1.put(1, "Krishna and Kanhaiya");
            answer_1.put(2, "Kanha and Madhav");
            answer_1.put(3, "Ghanshyam and Murari");
            answer_1.put(4, "Girdhar and Gopal");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Kanha and Madhav") {
                score = 5000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Kanha and Madhav*");
                answer = false;
                System.out.println("Your score is Rs. 0");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(
                    "App pahuch gaye hai pehle padav par jo hai Rs.10000\nAgar aap ne yaha se koi galat javab bhi de diya phir bhi app Rs.10000 ki dhan rashi jeet kar jayenge!!!!!!!!");
        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 5 for Rs.10000");
            System.out.println();
            System.out.println(
                    "Who wrote the introduction to the English translation of Rabindranath Tagore's Gitanjali?");
            System.out.println();
            answer_1.put(1, "P.B. Shelley");
            answer_1.put(2, "Alfred Tennyson");
            answer_1.put(3, "W.B. Yeats");
            answer_1.put(4, "T.S. Elliot");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "W.B. Yeats") {
                score = 10000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *W.B. Yeats*");
                answer = false;
                System.out.println("Your score is Rs.0");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 6 for Rs.20000");
            System.out.println();
            System.out.println(
                    "Where was the BRICS summit held in 2014?");
            System.out.println();
            answer_1.put(1, "Brazil");
            answer_1.put(2, "India");
            answer_1.put(3, "Russia");
            answer_1.put(4, "China");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Brazil") {
                score = 20000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Brazil*");
                answer = false;
                System.out.println("Your score is Rs.10000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 7 for Rs.40000");
            System.out.println();
            System.out.println(
                    "Which of these leaders was a recipient of a gallantry award in 1987 by a state government for saving two girls from drowning");
            System.out.println();
            answer_1.put(1, "Anandiben Patel");
            answer_1.put(2, "Vasundhara Raje Scindia");
            answer_1.put(3, "Uma Bharti");
            answer_1.put(4, "Mamata Banerjee");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Anandiben Patel") {
                score = 40000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Anandiben Patel*");
                answer = false;
                System.out.println("Your score is Rs.10000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 8 for Rs.80000");
            System.out.println();
            System.out.println(
                    "The wife of which of these famous sports persons was once captain of Indian volleyball team?");
            System.out.println();
            answer_1.put(1, "K.D.Jadav");
            answer_1.put(2, "Dhyan Chand");
            answer_1.put(3, "Prakash Padukone");
            answer_1.put(4, "Milkha Singh");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Milkha Singh") {
                score = 80000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Milkha Singh*");
                answer = false;
                System.out.println("Your score is Rs.10000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 9 for Rs.160000");
            System.out.println();
            System.out.println(
                    "Which of these terms can only be used for women?");
            System.out.println();
            answer_1.put(1, "Dirghaayu");
            answer_1.put(2, "Suhagan");
            answer_1.put(3, "Chiranjeevi");
            answer_1.put(4, "Sushil");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Suhagan") {
                score = 160000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Suhagan*");
                answer = false;
                System.out.println("Your score is Rs.10000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(
                    "App pahuch gaye hai dusre padav par jo hai Rs.320000\nAgar aap ne yaha se koi galat javab bhi de diya phir bhi app Rs.320000 ki dhan rashi jeet kar jayenge!!!!!!!!");
        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 10 for Rs.320000");
            System.out.println();
            System.out.println(
                    "Which of these stages is one of the four stages of human life in ancient Indian tradition?");
            System.out.println();
            answer_1.put(1, "Dronacharya");
            answer_1.put(2, "Bramhacharya");
            answer_1.put(3, "Vasudevacharya");
            answer_1.put(4, "Kripacharya");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Bramhacharya") {
                score = 320000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Bramhacharya*");
                answer = false;
                System.out.println("Your score is Rs.10000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 11 for Rs.640000");
            System.out.println();
            System.out.println(
                    "Which is the second most spoken language of Nepal?");
            System.out.println();
            answer_1.put(1, "Bajjika");
            answer_1.put(2, "Nepali");
            answer_1.put(3, "Maithili");
            answer_1.put(4, "Bhojpuri");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Maithili") {
                score = 640000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Maithili*");
                answer = false;
                System.out.println("Your score is Rs.320000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 12 for Rs.1250000");
            System.out.println();
            System.out.println(
                    "If Jwala Gutta and Ashwini compete as partners, in which sport are they participating?");
            System.out.println();
            answer_1.put(1, "Tennis");
            answer_1.put(2, "Table Tennis");
            answer_1.put(3, "Squash");
            answer_1.put(4, "Badminton");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Badminton") {
                score = 1250000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Badminton*");
                answer = false;
                System.out.println("Your score is Rs.320000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(
                    "App pahuch gaye hai tisre padav par jo hai Rs.2500000\nAgar aap ne yaha se koi galat javab bhi de diya phir bhi app Rs.2500000 ki dhan rashi jeet kar jayenge!!!!!!!!");
        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 13 for Rs.2500000");
            System.out.println();
            System.out.println(
                    "Effective on may 2014,the European union imposed a temporary ban on the import of which of these fruits from India?");
            System.out.println();
            answer_1.put(1, "Mango");
            answer_1.put(2, "Banana");
            answer_1.put(3, "Litchi");
            answer_1.put(4, "Pineapple");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Mango") {
                score = 2500000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Mango*");
                answer = false;
                System.out.println("Your score is Rs.320000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 14 for Rs.5000000");
            System.out.println();
            System.out.println(
                    " Where did Homi Jehangir Bhaba, the principal architect of India’s nuclear program, die in a plane crash?");
            System.out.println();
            answer_1.put(1, "Monte Rosa");
            answer_1.put(2, "Mount Ararat");
            answer_1.put(3, "Mount Elbrus");
            answer_1.put(4, "Mont Blanc");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Mont Blanc") {
                score = 5000000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Mont Blanc*");
                answer = false;
                System.out.println("Your score is Rs.2500000");
                System.out.println();
            }

        }

        if (answer == true) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Question 15 for Rs.10000000");
            System.out.println();
            System.out.println(
                    " Which celebrated Italian film maker on a visit to India fell in love with a Bengali lady, Sonali Dasgupta?");
            System.out.println();
            answer_1.put(1, "Roberto Rossellini");
            answer_1.put(2, "Sergio Leone");
            answer_1.put(3, "Federico Fellini");
            answer_1.put(4, "Luchino Visconti");
            System.out.println(answer_1);
            System.out.println();
            System.out.print("Enter your option number : ");
            a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.println("You can enter the number only between 1-4");
                a = sc.nextInt();
            }
            String b = answer_1.get(a);
            System.out.println(b);
            System.out.println();
            if (b == "Roberto Rossellini") {
                score = 10000000;
                System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                System.out.println();
                answer = true;
            } else {
                System.out.println("Galat javab");
                System.out.println("Correct answer is : *Roberto Rossellini*");
                answer = false;
                System.out.println("Your score is Rs.2500000");
                System.out.println();
            }

        }
        if (answer == true) {
            System.out.println();
            System.out.println(
                    "Do you want to play the 7 crore question?\nIf your answer is correct then you will receive Rs.7 Crore otherwise you will receive Rs.1 Crore");
            System.out.println("Enter your choice\n1.Yes\n2.No");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    if (answer == true) {
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Question 16 for Rs.70000000");
                        System.out.println();
                        System.out.println(
                                " Which of these tiger reserves in India is adjacent to Chitwan National park in Nepal?");
                        System.out.println();
                        answer_1.put(1, "Dudhwa");
                        answer_1.put(2, "Corbett");
                        answer_1.put(3, "Buxa");
                        answer_1.put(4, "Valmiki");
                        System.out.println(answer_1);
                        System.out.println();
                        System.out.print("Enter your option number : ");
                        a = sc.nextInt();
                        while (a < 1 || a > 4) {
                            System.out.println("You can enter the number only between 1-4");
                            a = sc.nextInt();
                        }
                        String b = answer_1.get(a);
                        System.out.println(b);
                        System.out.println();
                        if (b == "Valmiki") {
                            score = 10000000;
                            System.out.println("Sahi javab aur aap jeet gaye Rs. :" + score);
                            System.out.println();
                            answer = true;
                        } else {
                            System.out.println("Galat javab");
                            System.out.println("Correct answer is : *Valmiki*");
                            answer = false;
                            System.out.println("Your score is Rs.10000000");
                            System.out.println();
                        }

                    }
                }
                case 2: {
                    System.out.println("As your wish ");
                    System.out.println("Game over thanks for playing \nYour score is : " + score);
                }
            }

        }

    }
}

public class kbc {
    public static void main(String[] args) {
        System.out.println(
                "\nDevi o aur sajjano swagat hai aapka ek aur naye khel mein jiska naam hai \n\n\t\t\tKaun Banega Crorepati");
        question_and_answers qa = new question_and_answers();
        qa.question();
    }
}
