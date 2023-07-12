public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1867);
        System.out.println("warAndPeace.getBookTitle() = " + warAndPeace.getBookTitle());
        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor().getFirstName());
        System.out.println("warAndPeace.getAuthor().getLastName() = " + warAndPeace.getAuthor().getLastName());
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(2002);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
        System.out.println();

        Author nikolayNosov = new Author("Nikolay", "Nosov");
        Book neznaykaNaLune = new Book("Dunno on the Moon", nikolayNosov, 1965);
        System.out.println("neznaykaNaLune.getBookTitle() = " + neznaykaNaLune.getBookTitle());
        System.out.println("neznaykaNaLune.getAuthor().getFirstName() = " + neznaykaNaLune.getAuthor().getFirstName());
        System.out.println("neznaykaNaLune.getAuthor().getLastName() = " + neznaykaNaLune.getAuthor().getLastName());
        System.out.println("neznaykaNaLune.getPublicationYear() = " + neznaykaNaLune.getPublicationYear());

    }
}