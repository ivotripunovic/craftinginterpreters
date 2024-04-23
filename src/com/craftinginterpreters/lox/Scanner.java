package com.craftinginterpreters.lox;


import static com.craftinginterpreters.lox.TokenType.*;

class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    public Scanner(String source) {
        this.source = source;
    }
}
