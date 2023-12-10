public enum Subject {
    MATH("МАТЕМАТИКА"),
    HISTORY("ИСТОРИЯ"),
    BIOLOGY("БИОЛОГИЯ"),
    GEOGRAPHY("ГЕОГРАФИЯ"),
    PHYSICS("ФИЗИКА"),
    CHEMISTRY("ХИМИЯ");

    private String displayName;

    Subject(String displayName) {
        this.displayName = displayName;
    }
}
