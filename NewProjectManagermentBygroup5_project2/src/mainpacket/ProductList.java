package mainpacket;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> productList;

    // Constructor
    public ProductList() {
        this.productList = new ArrayList<>();
    }

    // Thêm sản phẩm vào danh sách
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Xóa sản phẩm khỏi danh sách
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    // Lấy danh sách sản phẩm
    public List<Product> getProductList() {
        return productList;
    }

    // Tìm sản phẩm theo ID
    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Tìm sản phẩm theo tên (tìm kiếm không phân biệt chữ hoa chữ thường và xử lý chuỗi)
    public List<Product> searchProductByName(String name) {
        List<Product> result = new ArrayList<>();
        String searchName = name.toLowerCase(); // Chuyển đổi chuỗi tìm kiếm thành chữ thường

        for (Product product : productList) {
            String productName = product.getName().toLowerCase(); // Chuyển đổi tên sản phẩm thành chữ thường
            if (productName.contains(searchName)) { // Sử dụng contains để kiểm tra chuỗi
                result.add(product);
            }
        }
        return result;
    }

    // Tìm sản phẩm theo danh mục
    public List<Product> searchProductByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }

    // Tìm sản phẩm theo trạng thái
    public List<Product> searchProductByStatus(boolean status) {
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.isStatus() == status) {
                result.add(product);
            }
        }
        return result;
    }
}
