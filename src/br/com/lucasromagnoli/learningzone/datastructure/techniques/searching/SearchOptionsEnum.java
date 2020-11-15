package br.com.lucasromagnoli.learningzone.datastructure.techniques.searching;

/**
 * @author github.com/lucasromagnoli
 * @since 11/2020
 */
public enum SearchOptionsEnum {
    LINEAR, BINARY;

    SearchOptionsEnum() {
    }

    public static SearchOptionsEnum parse(int value) {
        for (SearchOptionsEnum searchOptionsEnum : SearchOptionsEnum.values()) {
            if (searchOptionsEnum.ordinal() == value) {
                return searchOptionsEnum;
            }
        }

        throw new RuntimeException(String.format("Enum not found with this ordinal value %d", value));
    }
}
