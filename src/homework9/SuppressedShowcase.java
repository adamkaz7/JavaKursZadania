package homework9;

class SuppressedShowcase {
    static void run() {
        try (DummyResource resource = new DummyResource()) {
            resource.work();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            Throwable[] suppressedExceptions = exception.getSuppressed();
            System.out.println("Suppressed count: " + suppressedExceptions.length);
            for (Throwable suppressedException : suppressedExceptions) {
                System.out.println("Suppressed exceptions: " + suppressedException);
            }
        }
    }
}
