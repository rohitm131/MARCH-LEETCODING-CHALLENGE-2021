public class Codec {

    HashMap<String, String> DB = new HashMap();
    String BASE_URL = "http://tinyurl.com/";
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        String smallUrl = BASE_URL + longUrl.hashCode();
        DB.put(smallUrl, longUrl);
        return smallUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return DB.get(shortUrl);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
