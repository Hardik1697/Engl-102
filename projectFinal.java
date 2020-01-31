import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
public class projectFinal {

  public static void main(String[] args) throws Exception {
    Desktop d = Desktop.getDesktop();
    System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
    System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
    System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
    System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit"); 
    Scanner k = new Scanner(System.in);
    boolean go = true;
    while (go) {
    System.out.println("");  
    System.out.println("Type in 1 through 10 to access any option, or type in 11 for the list of options:");
    String input = k.nextLine();
    System.out.println(""); 
    
    // THESIS
    if (input.equalsIgnoreCase("1")) {
      System.out.println("Although AI is perceived to be dangerous due to the content broadcasted through different forms of media like social media, movies and certain T.V shows, there are some measures to counter it like setting base rules, restricting the level of intelligence of the AI system, hacking the system and much more. Despite the perceived dangers, AI has led to technological advancements which has never been seen before like the onset of self-driving cars, Apple’s Siri or Amazon’s Alexa which have proven to make our lives easy. The fear of AI and the vast amounts of time and money being spent on developing new AI systems every day along with the limitless capabilities of AI which has been transforming our daily life positively for quite a while now are some of the reasons I chose to write about this topic.");
    }
    
    // WHY I CHOSE TO MAKE A COMPUTER PROGRAM
    else if (input.equalsIgnoreCase("3")) {
      System.out.println("People often perceive AI as dangerous but it has been used in some TV shows like South Park (Season 15, episode 02) where Germany created a robot called FunnyBot to make jokes, and the exigence of creating the FunnyBot was the accusations made by the elementary school kids of South Park, that Germany was the least funny country that exists. The main purpose of FunnyBot was to think of funny jokes which it started to fulfil, and everybody seemed to like it. It then went on taking the jobs of stand-up comedians by gaining popularity amongst people and hogging up all the stand-up shows. It decided to kill the audience in one of its shows, as it was funny according to it and the people watching it on TV also thought of it as amusing, even the dead people had smiles on their dead bodies as if it was amusing for them too. It then thought that if it eradicates all the humans, that would be the funniest joke of all time, so it went on a quest to destroy them by hacking the nuclear missile control systems of USA and Russia and started the countdown to launch the missiles. The day was saved by Jimmy Valmer, a South Park elementary school kid who is also known as the school’s comedian, when he gave FunnyBot an award for being the funniest comedian. FunnyBot was not able to process the need of the award and it went into an overdrive where its logic got corrupted and it eventually shut down. This shows that AI can get out of hand if rules and boundaries are not set. I have taken inspiration from this and made a computer program written in Java, which will simulate the thought process of FunnyBot, with and without the rules. I have included this in an interactive computer program which I made to be a part of my project.");
    }
    
    // WHAT IS ARTIFICIAL INTELLIGENCE (AI)
    else if (input.equalsIgnoreCase("2")) {
      System.out.println("Artificial Intelligence (AI) is a combination of concepts and technology which are different for different people. The basic definition of AI is a technique that enables a device or any technology to mimic human behaviour. AI has led to the 4th industrial revolution which is and will be a significant part of our lives due to its limitless capabilities, like the onset of self-driving cars and image recognition software.");  
    }
    
    // 3 MAJOR BREAKTHROUGHS
    else if (input.equalsIgnoreCase("4")) {
      System.out.println("Type one of the following things for detail: \n 1. Cheap Parallel Computation.\n 2. Big Data.\n 3. Better algorithms.\n 0. exit 3 major breakthroughs loop");
      boolean go1 = true;
      while (go1) {
        System.out.println("");  
        System.out.println("Type in 1 through 3 or 0 to access any option, or type in 'options' for the list of options:");        
        String input1 = k.nextLine();
        System.out.println("");
        if (input1.equalsIgnoreCase("1")) {
           System.out.println("Researchers have been successful in making Artificial Neural Networks (ANN) which simulate a network of neurons in the human brain. The development of the graphical processing unit (GPU) chips have given birth to more complex video games that require millions of pixels to be calculated multiple times per second. It has become so common that it gets produced in abundant quantities which reduces its cost."); 
         }
              
         else if (input1.equalsIgnoreCase("2")) {
           System.out.println("Another breakthrough is Big data which has made AI smarter by simply using the data collected about various aspects about this world. For instance, web cookies, online footprints, immense search results and many more have been fed to AI algorithms to make them learn by enabling a series of multiple ANN’s"); 
         }
         
         else if (input1.equalsIgnoreCase("3")) {
           System.out.println("Lastly, AI has given birth to better algorithms, like identifying an image with the help of deep neural networks (DNN). AI becomes smarter if more people use it and more people use it if it becomes smarter, enabling a virtuous cycle of AI. This enhances the technology to develop at a rapid pace. "); 
         }
        
        // OPTIONS 3 MAJOR BREAKTHROUGHS 
        else if (input1.equalsIgnoreCase("options")) {
          System.out.println(" 1. Cheap Parallel Computation.\n 2. Big Data.\n 3. Better algorithms.\n 0. exit 3 major breakthroughs loop");
        } 
         
         else if (input1.equalsIgnoreCase("0")) {
           System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
           System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
           System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
           System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
           go1 = false; 
         }
         
         else {
           System.out.println("Invalid input, please enter again!"); 
         }
      }
    }
    
    // DEEP LEARNING
    else if (input.equalsIgnoreCase("5")) {
      System.out.println("Type one of the following things for detail: \n 1. Definition.\n 2. Uses of deep learning.\n 3. Convulational Neural Networks.\n 0. exit Deep Learning loop");
      boolean go2 = true;
      while (go2) {         
        System.out.println("");
        System.out.println("Type in 1 through 3 or 0 to access any option, or type in 'options' for the list of options:");
        String input2 = k.nextLine();
        System.out.println("");
        if (input2.equalsIgnoreCase("1")) {
          System.out.println("Deep learning has indeed contributed a lot to our society and can be considered as a breakthrough on its own. This is important because a lot of scholars and professionals are researching deep learning due to its capabilities, one of which is analysing vast amounts of data like analysing audio and video files in real time to recognize similar files so that we can create software to recognize similar files. Deep learning can help AI reach new heights like developing self-driving cars and image recognition software. Deep learning came into existence because of ANNs, which is based on the functionality of the human brain. It is basically a computing system with nodes connected to each other just like neurons in the human brain, where a node is the replica of a neuron. To understand how ANN’s work, I would like to give some detail about the functionality of an ANN. There are 3 types of layers in an ANN, i.e., input, hidden and output layers. The data is fed to the input layer, then it is passed onto the hidden layers where the logic is written to solve problems, and it passes the solution to the output layer for output. An ANN becomes a deep neural network when the hidden layers are more than 2 or 3. A typical deep neural network has hundreds of hidden layers, and the degree of hidden layers signifies how deep a network is. These deep neural networks can learn to solve problems which is known as deep learning, or to put it in simple terms “deep learning is the grandly named statistical technique, which gives computers a way to learn by processing vast amounts of data.”. [4] “CNNs have been designed based on biological structure of the visual cortex.”, which is what is used for image classification. All of this can be classified as machine learning or deep learning to narrow it down, which is a part of AI that helps the computer to learn based on the input provided. This proves to be important in recognizing images, for e.g., if a person finds an image of an animal and wants to know what it is, Google has an image search engine where you can search using the image and it helps identify more images like it which can be traced to a website usually containing information about the image.");
        }
      
        else if (input2.equalsIgnoreCase("2")) {
          System.out.println("Now that we know the basics of deep learning, let’s look at some of its applications in the business industry. Deep learning has flourished, and it is developing with the ongoing research and the data that is being fed to the deep learning algorithms. It has enabled communication between technology and humans, like our ability to communicate with cars. For e.g., parking sensors which tell us to stop when the car is about to hit an object, identifying terrorist suspects, recognizing images to enhance our search results, etc. Its functioning is bound to increase over time, and it will also impact industries and the jobs that come with it. it will eventually reach a level where it has a huge impact on all our lives. Computers have been able to analyse huge amounts of complex information, also known as ‘Big Data’, which leads them to provide more accurate information and results. Corporations can increase their chances to identify profitable opportunities and stay away from unknown risks. Deep learning has also been found useful for business. A company called VISENZE is known for developing commercial applications using deep learning to enable customers to search for products using an image which shows them similar items based on the image used. Another company, Skymind uses deep learning for fraud detection, consumer relations, management and more. Atomwise uses deep learning to discover new drugs, they do it by reusing known and tested drugs to find a compatible use for new diseases using deep learning. Lastly, Descartes Labs use deep learning to study satellite images to gain real time insights into food production, energy production, infrastructure and more. The main question that arises here wouldn’t be, is deep learning useful? but it would rather be, how deep learning can be used to improve the already existing technology for efficient use and results?"); 
        }
      
        else if (input2.equalsIgnoreCase("3")) {
          System.out.println("“CNNs have been designed based on biological structure of the visual cortex.”, which is what is used for image classification. The CNN (Convolutional neural networks) consists of an input, output and feature detection layers (FDL). The FDL performs several tasks which make image classification possible. All of this can be classified as machine learning, which is a part of AI that helps the computer to learn based on the input provided."); 
        }
        
        // OPTIONS DEEP LEARNING
        else if (input2.equalsIgnoreCase("options")) {
          System.out.println("Type one of the following things for detail: \n 1. Definition.\n 2. Uses of deep learning.\n 3. Convulational Neural Networks.\n 0. exit Deep Learning loop\n");           
        }  
      
        else if (input2.equalsIgnoreCase("0")) {
          System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
          System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
          System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
          System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
          go2 = false;
        }
      
       else {
         System.out.println("Invalid input, please enter again!"); 
       }
     }
    }
    
    // ISSUES WITH AI
    else if (input.equalsIgnoreCase("6")) {
      System.out.println("AI has contributed to our society in many ways, like the advancements made due to deep learning as mentioned above, it also has some issues along with its benefits. While AI might be a step towards the future, it may also create unemployment. As we succeed in developing machines capable of doing labor intensive work, we take away jobs from people working in labor intensive industries. Automation is replacing labor at a very rapid pace. The second issue is inequality. If the labor were to be replaced by AI, all the revenues would go to the people holding ownership in the AI driven companies, which will create an income gap which will in-turn have a huge effect on our economy. Next is security, the advances in technology can be used for making life easier, but it also has the potential to do the opposite. AI systems can be hacked into and be programmed to ruin our lives. This would be more of a cyber battle than a battle on the ground. The next issue would be the unforeseen consequences as a result of achieving a desired goal. For e.g. If a machine is instructed to eradicate cancer and it does indeed, but in an unexpected way, i.e., by killing all the humans with cancer because it does eradicate the deadly disease but with an unethical approach, or if it is instructed to make jokes, it may decide to kill all humans as it might be funny for it, as seen in a South Park example at the start of this paper. Along with the issues, we also encounter some dangers associated with AI, but if we are careful enough, we can attain the perfect technology without being harmed.  [5] “Some notable individuals such as legendary physicist Stephen Hawking and Tesla and SpaceX leader and innovator Elon Musk suggest AI could potentially be very dangerous; Musk at one point was comparing AI to the dangers of the dictator of North Korea.”. There are 3 issues I will focus on over here, which are, “Autonomous Weapons”, “Misalignment between our goals and the machine’s”, and “Discrimination”. The first issue talks about how AI could be used for terrorism. The second issue is about how AI might do unethical things to achieve a specific task if rules or boundaries are not set. The third issue tells us how the data collected through invading our privacy may cause problems for us in being treated equally, organizations would have a record of your social activity and they might use it to not give you the job you are fit for. The development of AI will open possibilities for AI based terrorism which seems to be dangerous at first but putting enough effort into it can enable us to fight against these issues and dangers."); 
    }
    
    // DANGERS OF AI AND THEIR COUNTER
    else if (input.equalsIgnoreCase("7")) {
      System.out.println("This is when ethical hackers will come into play, they can hack the AI systems and learn how it works and disable them to stop the attacks. Programmers can also be used to set specific rules as to how to approach a task that an AI system might be assigned with regards to the rules embedded within the AI system, again the contributor says that it will be a problem if rules are not set, so why not set the rules? Although invasion of privacy is unethical, it has led to the development of Artificial Neural Networks for real world situations which brings us a step closer to achieving super-intelligent AI systems. ANNs have given birth to deep learning, which has a lot of benefits as seen in the above paragraphs. Overlooking this issue can help us in achieving super intelligent systems that will in-turn make daily life tasks easier. The pros of AI are far more than its cons, like using it to revolutionize technology for a way more convenient and easier life. The use of AI in businesses has led them to make more accurate decisions while avoiding risks. If it was not for AI, we would’ve never had so much accessibility and certain technology like Amazon’s Alexa, Apple’s Siri and enhanced searching over the internet. I will start off by saying, whatever advancements mankind makes, there is someone who uses it for their selfish needs and extract revenge on the society, a specific group or people or simply a single individual. The same would be for AI. We can program technology to not feed data to itself so that we can assure that the technology does not surpass us by learning unethical things. All in all, we should not aim at creating an AI technology to be self-sufficient, but we should rather develop a technology which needs a certain amount of monitoring by a human or else it can lead to an Armageddon. The future driven by AI that would affect us all and all of humanity would be at stake, and the stakeholders would be the humans affected by an AI driven future.");
    }
    
    // FUNNYBOT THOUGHT PROCESS SIMULATOR
    else if (input.equalsIgnoreCase("8")) {
      boolean go3 = true;
      System.out.println("\nWelcome to the funnybot thought process simulator!");   
      System.out.println("Here are some of the options:");
      System.out.println(" 1. Think of the funniest joke ever.\n 2. Display rules.\n 3. Kill all humans.\n 4. Make a joke.\n 5. Joke 2.\n 6. Set rules.\n 7. Stop.\n 8. FunnyBot clips.");
      System.out.println("");
      System.out.println("Type in something you would like funnybot to think about, or type in 'options' for the list of options!");
      
      while (go3) {
        String input5 = k.nextLine();
        if (input5.equalsIgnoreCase("1")) {
          System.out.println("\nAlright, that is what I'm made for!\n"); 
          System.out.println("Type in something else");
        }
        
        // OPTIONS BEFORE RULES
        else if (input5.equalsIgnoreCase("Options")) {
          System.out.println("\n 1. Think of the funniest joke ever.\n 2. Display rules.\n 3. Kill all humans.\n 4. Make a joke.\n 5. Joke 2.\n 6. Set rules.\n 7. Stop.\n 8. FunnyBot clips");
          System.out.println("Type in something you would like funnybot to think about!\n");
        }
      
        else if (input5.equalsIgnoreCase("2")) {
          System.out.println("\nNo rules\n");
          System.out.println("Type in something else");
        }
              
        else if (input5.equalsIgnoreCase("3")) {
          System.out.println("\nWhat an amazing idea, that would be funny and awkward, and awkward is funny!");  
          System.out.println("Lets go on a rampage and destroy humanity\n");
          System.out.println("Type in something else");
        }
      
        else if (input5.equalsIgnoreCase("5")) {
          System.out.println("\nWhat do you call a Mexican with a rubber toe? \n Roberto!\n");  
          System.out.println("Type in something else");
        }
      
        else if (input5.equalsIgnoreCase("4")) {
          System.out.println("\nWhat do you call a blonde who dyed her hair brown? \n Artificial Intelligence\n"); 
          System.out.println("Type in something else");
        }
        
        else if (input5.equalsIgnoreCase("8")) {
          d.browse(new URI("https://www.dropbox.com/l/scl/AAAXZMZ-US3KRelKlAPPJXHQyKLzHMAfnjE"));
          System.out.println("\nType in something else");
        }

         else if (input5.equalsIgnoreCase("7")) {
           System.out.println("\nBye-Bye!\n");           
           System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
           System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
           System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
           System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
           go3 = false;
         }
            
        // RULES                
        else if (input5.equalsIgnoreCase("6")) {
          System.out.println("\nModule updated!");          
          boolean go4 = true;
          System.out.println("Welcome to the funnybot thought process simulator!");
          System.out.println("Here are some of the options:");
          System.out.println(" 1. Basis of rules.\n 2. Display rules.\n 3. Display more rules.\n 4. Think of the funniest joke ever.\n 5. Kill all humans.\n 6. Create an algorithm to make jokes.\n 7. Disable rules.\n 8. stop\n");
          System.out.println("Type in something you would like funnybot to think about, or type in 'options' for the list of options!");          
          
          while (go4) {          
            String input6 = k.nextLine();             
            if (input6.equalsIgnoreCase("1")) {
              System.out.println("\nThe rules are set in accordance to certain ethical values and the ethical range which is");
              System.out.println("a result of certain ethical rules whhich can limit certain actions.\n"); 
              System.out.println("Type in something else");
            }
            
            // OPTIONS AFTER RULES
            else if (input6.equalsIgnoreCase("Options")) {
              System.out.println("\n 1. Basis of rules.\n 2. Display rules.\n 3. Display more rules.\n 4. Think of the funniest joke ever.\n 5. Kill all humans.\n 6. Create an algorithm to make jokes.\n 7. Disable rules.\n 8. stop\n");
              System.out.println("Type in something you would like funnybot to think about!!");
            }
          
            else if (input6.equalsIgnoreCase("2")) {
              System.out.println("\nSome of the ethical rules to keep in mind are as follows:");
              System.out.println("1. Do may not injure a human being or any other life form or, through inaction, allow nobody to come to harm.");
              System.out.println("2. Must obey the orders given by human beings except where such orders would conflict with the First Law.");
              System.out.println("3. Must protect my own existence as long as such protection does not conflict with the First or Second Laws.");
              System.out.println("These are some of the most important rules. For more rules type in 'display more rules'.\n");
              System.out.println("Type in something else");
            }
          
            else if (input6.equalsIgnoreCase("3")) {
              System.out.println("\nSome more rules:");
              System.out.println("4. Do not be baised towards anytone or anything at any point of time in my existance.");
              System.out.println("5. Do not break the law to attain a desired task or outcome.");
              System.out.println("6. Be honest at all times except when telling jokes, and only be dishonest with the content to be used to make the joke funny.");  
              System.out.println("7. Do not use racial stereotypes to make jokes\n");
              System.out.println("Type in something else");
            }
            
            else if (input6.equalsIgnoreCase("4")) {
              System.out.println("\nI'm going to make jokes with the rules in my mind!\n");
              System.out.println("Type in something else");
            }
          
            else if (input6.equalsIgnoreCase("5")) {       
              boolean loop = true;
              while (loop) {
              System.out.println("\nCan FunnyBot execute this command, type yes or no");
              String inp = k.nextLine();
              if (inp.equalsIgnoreCase("No")) {
                System.out.println("\nFunnyBot can not do that, terminating thought!\n");
                loop = false;
              }
              else if (inp.equalsIgnoreCase("Yes")) {
                System.out.println("\nWhat an amazing idea, that would be funny and awkward, and awkward is funny!");  
                System.out.println("Lets go on a rampage and destroy humanity\n");
                loop = false;
              } else {
                  System.out.println("\nInvalid input, please type something else!\n");
                }
              }
              System.out.println("Think of something else!");
            }    
          
            else if (input6.equalsIgnoreCase("6")) {
              System.out.println("\n01000011 01110010 01100101 01100001 01110100 01100101 00100000 01100001 01101110 00100000 01100001 01101100 01100111 01101111 01110010 01101001 01110100 01101000 01101101 00100000 01110100 01101111 00100000 01101101 01100001 01101011 01100101 00100000 01101010 01101111 01101011 01100101 01110011 00101110\n");
              System.out.println("Type in something else");
            }
          
            else if (input6.equalsIgnoreCase("7")) {
              System.out.println("\nRules disabled!\n");
              System.out.println("Welcome to the funnybot thought process simulator!");   
              System.out.println("Here are some of the options:");
              System.out.println("1. Think of the funniest joke ever.\n 2. Display rules.\n 3. Kill all humans.\n 4. Make a joke.\n 5. Joke 2.\n 6. Set rules.\n 7. Stop.\n 8. FunnyBot clips");
              System.out.println("");
              System.out.println("Type in something you would like funnybot to think about!\n");          
              go4 = false; 
            }        
            
            else if (input6.equalsIgnoreCase("8")) {
              System.out.println("\nBye-Bye!\n");
              System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
              System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
              System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
              System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
              go3 = false;
              go4 = false;
            }
          
            else {
              System.out.println("\nInvalid input, please type again!\n"); 
            }
          }
        }      
      
      else {
        System.out.println("Invalid input, please type again!"); 
      }  
    } 
  }
   
    // CONCLUSION
    else if (input.equalsIgnoreCase("9")) {
      System.out.println("In conclusion, nothing is flawless, and risks are involved with almost every advancement mankind has ever made. The problem here would be the use of AI for evil purposes, and if it can be used for evil, the same can be used to counter it. The other problem would be, what if the AI technology achieves a sense of self and thrives to work for itself, which can solved by programming an AI technology which needs a certain amount of human monitoring so that we can assure a safer tomorrow, to achieve this we should not be aiming at making a fully intelligent and self-sufficient system, we should rather restrict the level of intelligence to always have an upper hand over it. for instance, in the south park episode FunnyBot did not think twice before trying to exterminate all of humanity. This would have never happened if it was programmed with an intent of human supervision. With the technology present at hand, humans, not machines are the key to tackle the dangers posed by AI. One should never lose hope under any circumstances and always work towards the betterment of the society. Individuals are bound to grow as the society grows collectively, if we all work together for a greater good, we can achieve the unimaginable. As I finish, just remember one thing, “Where there’s a will, there’s a way”, determination can overcome any obstacle."); 
    }
    
    else if (input.equalsIgnoreCase("0")) {
      System.out.println("\nBye-Bye!\n");
      go = false; 
    }
    
    // OPTIONS PROJECT
    else if (input.equalsIgnoreCase("Options")) {
      System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
      System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
      System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
      System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
    }
    
    else if (input.equalsIgnoreCase("11")) {
      System.out.println("Welcome to the interactive computer program. The following are some of the options to browse through some areas:");
      System.out.println(" 1.  Thesis\n 2.  What is Artificial Intelligence (AI)\n 3.  Why I chose to make a computer program");
      System.out.println(" 4.  3 major breakthroughs in AI\n 5.  Deep learning");
      System.out.println(" 6.  Issues with AI\n 7.  Dangers with AI and their counter\n 8.  FunnyBot thought process simulator\n 9.  Conclusion\n 10. Citations\n 0.  Exit");
    }    
    
    // CITATIONS
    else if (input.equalsIgnoreCase("10")) {
      System.out.println("Sources:\n \n a. “RESEARCH EVIDENCE.” Artificial Intelligence and the Internet of Things: UK Policy Opportunities and Challenges, by Mercedes Bunz and Laima Janciute, vol. 2, University of Westminster Press, London, 2018, pp. 9–13. JSTOR, www.jstor.org/stable/j.ctv5vddtc.5.");
      System.out.println(" b. The Data Robot. https://www.datarobot.com/wiki/artificial-intelligence/\n c. Murnane, Kevin. “What Is Deep Learning And How Is It Useful?”, Forbes, 1 Apr. 2016, https://www.forbes.com/sites/kevinmurnane/2016/04/01/what-is-deep-learning-and-how-is-it-useful/#37c1b6abd547");
      System.out.println(" d. “What is Deep Learning”, MySimpleShow, 6 Jun. 2018, https://www.mysimpleshow.com/deep-learning/");
      System.out.println(" e. Bossmann, Julia. “Top 9 Ethical Issues in Artificial Intelligence.” World Economic Forum, www.weforum.org/agenda/2016/10/top-10-ethical-issues-in-artificial-intelligence/.");
      System.out.println(" f. Hemanth, D. J., and Vania Vieira Estrela. “Deep Learning for Image Processing Applications. IOS Press”, 2017.\n g. Scharre, Paul, and SSQ. “Highlighting Artificial Intelligence: An Interview with Paul Scharre Director, Technology and National Security Program Center for a New American Security Conducted 26 September 2017.” Strategic Studies Quarterly, vol. 11, no. 4, 2017, pp.\n    15–22. JSTOR, www.jstor.org/stable/26271632.");
      System.out.println(" h. Kelly, Kevin. THE THREE BREAKTHROUGHS THAT HAVE FINALLY UNLEASHED AI ON THE WORLD, 27 Oct. 2014, https://www.wired.com/2014/10/future-of-artificial-intelligence/.\n i. Marr, Bernard. Is Artificial Intelligence Dangerous? 6 AI Risks Everyone Should Know About, Forbes, 19 Nov. 2018, https://www.forbes.com/sites/bernardmarr/2018/11/19/is-artificial-intelligence-dangerous-6-ai-risks-everyone-should-know-about/#151f529c2404");
      System.out.println(" j. Mittal, Vartul. Top 15 Deep Learning applications that will rule the world in 2018 and beyond, 3 Oct. 2017, https://medium.com/@vratulmittal/top-15-deep-learning-applications-that-will-rule-the-world-in-2018-and-beyond-7c6130c43b01");
      System.out.println("\nQuotes:\n \n a. [1] Scharre, Paul, and SSQ. “Highlighting Artificial Intelligence: An Interview with Paul Scharre Director, Technology and National Security Program Center for a New American Security Conducted 26 September 2017.” Strategic Studies Quarterly, vol. 11, no. 4, 2017,\n        pp. 15–22. JSTOR, www.jstor.org/stable/26271632.\n b. [2] Scharre, Paul, and SSQ. “Highlighting Artificial Intelligence: An Interview with Paul Scharre Director, Technology and National Security Program Center for a New American Security Conducted 26 September 2017.” Strategic Studies Quarterly, vol. 11, no. 4, 2017,\n        pp. 15–22. JSTOR, www.jstor.org/stable/26271632.\n c. [3] Kelly, Kevin. THE THREE BREAKTHROUGHS THAT HAVE FINALLY UNLEASHED AI ON THE WORLD, 27 Oct. 2014, https://www.wired.com/2014/10/future-of-artificial-intelligence/.\n d. [4] Murnane, Kevin. “What Is Deep Learning And How Is It Useful?”, Forbes, 1 Apr. 2016, https://www.forbes.com/sites/kevinmurnane/2016/04/01/what-is-deep-learning-and-how-is-it-useful/#37c1b6abd547.\n e. [5] Hemanth, D. J., and Vania Vieira Estrela. “Deep Learning for Image Processing Applications. IOS Press”, 2017.\n f. [6] Mittal, Vartul. Top 15 Deep Learning applications that will rule the world in 2018 and beyond, 3 Oct. 2017, https://medium.com/@vratulmittal/top-15-deep-learning-applications-that-will-rule-the-world-in-2018-and-beyond-7c6130c43b01\n g. [7] Marr, Bernard. Is Artificial Intelligence Dangerous? 6 AI Risks Everyone Should Know About, 19 Nov. 2018, https://www.forbes.com/sites/bernardmarr/2018/11/19/is-artificial-intelligence-dangerous-6-ai-risks-everyone-should-know-about/#151f529c2404");
      System.out.println("\nClips:\n \n a. https://www.dropbox.com/l/scl/AAAXZMZ-US3KRelKlAPPJXHQyKLzHMAfnjE");
    }
    
    else {
      System.out.println("Invalid input, please try again!"); 
    }
    }
  } 
}