package com.company;

import java.util.*;


public class Library {
    public static void main(String[] args) {
        addTS();
    }
    public static void addTS(){
        HashSet<Book> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Put account ID: ");
            int id = sc.nextInt();
            System.out.println("Book name: ");
            String bName = sc.next();

            System.out.println("Book Author: ");
            String bAuthor = sc.next();

            System.out.println("Book Price: ");
            double bPrice = sc.nextDouble();
            hashSet.add(new Book(id,bName,bAuthor,bPrice));
            System.out.println("if uou want to proceed, press Y/N");
            String str = sc.next();
            if("Y".equals(str)){
                System.out.println(hashSet);
            }else{
                System.out.println("View book");
                break;
            }
        }while (true);
        ArrayList<Book> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        Iterator<Book> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book);
        }
    }

}
//public class RepeatingString{
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Put a name: ");
//        String str = sc.next();
//        System.out.println("The name is: "+str);
//        char[]cha = str.toCharArray();
//
//        Set s1 = new HashSet();
//        Set s2 = new HashSet();
//        Set s3 = new HashSet();
//        for (Object obj : cha){
//            boolean flag = s1.add(obj);
//            if(flag == false){
//                s2.add(obj);
//            }
//        }
//        s3.addAll(s1);
//        s3.removeAll(s2);
//        System.out.println("Remove the repeated name: ");
//        System.out.println(s1);
//        System.out.println("The repeated string is: ");
//        System.out.println(s2);
//        System.out.println("The non repeated string is: ");
//        System.out.println(s3);
//    }
//
//}
//}

