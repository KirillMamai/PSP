package kirill.mamay.FirstApp;

public	class	FirstClass	{

    static public void printLine(){
        System.out.println("------------------------------------------");
    }

    public	static	void	main(String[]	args)	{

        Book b1 = new Book("Кот в сапогах",Boolean.FALSE,1300);
        Book b2 = new Book("Алые паруса",249);
        Book b3 = new Book("Буратино",Boolean.FALSE);

        WriterInfo w1 = new WriterInfo();

        printLine();

        w1.printWriterAllInfo(b1);

        printLine();

        b1.printAllInfo();

        printLine();

        b2.printAllInfo();

        printLine();

        b3.printAllInfo();

        printLine();
    }
}

