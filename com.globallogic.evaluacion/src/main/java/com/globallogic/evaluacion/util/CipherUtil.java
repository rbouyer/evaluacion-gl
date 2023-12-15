package com.globallogic.evaluacion.util;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CipherUtil {
	private static final String AES = "AES";
	private static final String SECRET = "abc-1234-xyz-567";
	
	public static String encrypt(String decData) {
		String result = null;
		
        try {
    		Key key = new SecretKeySpec(SECRET.getBytes(), AES);
    		Cipher cipher = Cipher.getInstance(AES);
    		
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result =  Base64.getEncoder().encodeToString(cipher.doFinal(decData.getBytes()));
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new IllegalStateException(e);
        }
        
        return result;
    }
	
	public static String decrypt(String encData) {
		String result = null;
		
        try {
    		Key key = new SecretKeySpec(SECRET.getBytes(), AES);
    		Cipher cipher = Cipher.getInstance(AES);
    		
            cipher.init(Cipher.DECRYPT_MODE, key);
            result = new String(cipher.doFinal(Base64.getDecoder().decode(encData)));
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new IllegalStateException(e);
        }
        
        return result;
    }
}
