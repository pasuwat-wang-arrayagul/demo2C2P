/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package demo;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * @function demo
 * @package demo
 * @classname Security
 * @author Pasuwat Wang (CENS ONLINE SERVICES)
 * @created Jan 19, 2021 11:41:13 PM
 */
public class Security {

	public static void main(String[] args) {
		try {
			String secret = "secret";
			String message = "Message";

			System.out.println(encryptHmacSHA1(secret , message));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static String encryptHmacSHA1(String secret, String message) {
		String algorithm = "HmacSHA1";
		String hash = "";
		try {
			Mac sha1_HMAC = Mac.getInstance(algorithm);
			SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), algorithm);
			sha1_HMAC.init(secret_key);

			hash = Base64.encodeBase64String(sha1_HMAC.doFinal(message.getBytes()));
		} catch (Exception e) {
			System.out.println("Error");
		}
		return hash;
	}

}
