package java17;

// 継承関係を明示的に制限できます。
public sealed interface SealedClasses
        permits Success, Failure {
}

final class Success implements SealedClasses {
}

final class Failure implements SealedClasses {
}