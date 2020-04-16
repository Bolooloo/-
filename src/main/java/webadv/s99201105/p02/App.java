package webadv.s99201105.p02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
    	BufferedReader bf = null;
    	String id,pwd;
    	
    	bf = new BufferedReader(new FileReader("id.txt"));
    	id = bf.readLine();
    	pwd= bf.readLine();
    	
    	if(id.equals(args[0])&&pwd.equals(sha256hex(args[1]))) {
    		System.out.println("登陆成功");
    	}else {
    		System.out.println("登陆失败");
    	}
    	
//        if (args.length < 1) {
//            System.err.println("Please provide an input!");
//            System.exit(0);
//        }
//        System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

