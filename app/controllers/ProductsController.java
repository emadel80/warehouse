package controllers; 

import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;
import models.Product;
import views.html.products.list;

public class ProductsController extends Controller {

  public Result list() {
    List<Product> products = Product.findAll();
    return ok(list.render(products));
  }

  public Result newProduct() {
    return ok();
  }

  public Result details(String ean) {
    return ok();
  }

  public Result save() {
    return ok();
  }

}
