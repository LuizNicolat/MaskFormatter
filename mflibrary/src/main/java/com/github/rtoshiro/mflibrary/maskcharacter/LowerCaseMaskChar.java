package com.github.rtoshiro.mflibrary.maskcharacter;

/**
 * Created by Tox on 12/8/15.
 */
public class LowerCaseMaskChar extends MaskChar {

    public boolean isValid(char c) {
        return Character.isLowerCase(c);
    }
}