package week1.excercise2;
class Product{
    private String productid;
    private String productNAme;
    private String  category;
    public Product(String productid,String productNAme,String  category){
        this.productNAme=productNAme;
        this.productid=productid;
        this.category=category;
    }
    public String getProductId() {
        return productid;
    }

    public String getProductName() {
        return productNAme;
    }

    public String getCategory() {
        return category;
    }
}
class linearsearch{
    static Product search(Product[] p,String id){
        for(Product i:p){
            if(i.getProductId().equals(id)){
                return i;
            }
        }
        return null;
    }
}
public class EComerceSearchFunction {
    static Product sortbinary(Product[] p,String id){
        int left=0,right=p.length-1;
        while(left<=right){
            int mid=(right-left)/2;
            int com = p[mid].getProductId().compareTo(id);
            if(com==0){
                return p[mid];
            }
            else if(com<0){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return null;
    }
    public static void main(String[] args) {
        final Product p[] = {
            new Product("1001", "book","shipping"),
            new Product("1002", "songs", "copyright"),
            new Product("1003", "xxxx", "null")
        };
        String id ="1002";
        Product find = sortbinary(p, id);
        if(find!=null){
            System.out.println("FOund by binary");
        }
        Product find1 = sortbinary(p, id);
        if(find1 != null){
            System.out.println("Found by LinearSearch");
        }

    }
}

