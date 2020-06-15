public interface Classable {
    public static final int INFERIEUR = -1;
    public static final int EGAL = 0;
    public static final int SUPERIEUR = 1;
    public static final int ERREUR = -99;

    int Compare(Object o);
}