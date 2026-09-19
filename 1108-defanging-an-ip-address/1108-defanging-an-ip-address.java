class Solution {
    public String defangIPaddr(String address) {
        String s ="1.1.1.1";
        return address.replace(".","[.]");
        
    }
}