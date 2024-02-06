package lectures.fundamentals.practice.AlfredBot.start;

import lectures.fundamentals.practice.AlfredBot.start.utils.AlfredQuotes;

public class AlfredTest {

    public static void main(String[] args) {
        System.out.println("Alfred bot assignment");
        AlfredQuotes alfredQuotes = new AlfredQuotes();
        System.out.println(alfredQuotes.greeting("Beth", "Kane", 123.45 ));
        System.out.println(alfredQuotes.greeting("Beth Kane"));
        System.out.println(alfredQuotes.dataAnnouncement());

        
        String alexisTest = (alfredQuotes.respondBeforeAlexis(
            "Alexis! Play some low-fi beats."
            ));
            System.out.println(alexisTest);
        String alfredTest = alfredQuotes.respondBeforeAlexis(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
            System.out.println(alfredTest);
        String notRelevantTest = alfredQuotes.respondBeforeAlexis(
                    "Maybe that's what Batman is about. Not winning. But failing.."
                    );
             System.out.println(notRelevantTest);       
                    
                }
            }