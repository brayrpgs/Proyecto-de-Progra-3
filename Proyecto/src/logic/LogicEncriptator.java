/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @author brayrpgs
 */
public class LogicEncriptator {

    public LogicEncriptator() {
    }
    
    public String encriptation(String password){
        return DigestUtils.md5Hex(password);
    }
    
}
