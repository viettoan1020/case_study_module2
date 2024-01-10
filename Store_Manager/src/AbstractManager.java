import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager <T extends Product> {
    protected List<T> itemList;

    public AbstractManager() {
        this.itemList = new ArrayList<>();
    }
    public void addItem(T item) {
        itemList.add(item);
    }
    public void editItem(String itemId, T updatedItem) {
        for (int i = 0; i < itemList.size(); i++) {
            T currentItem = itemList.get(i);
            if (currentItem.getProductID().equals(itemId)) {
                itemList.set(i, updatedItem);
                break;
            }
        }
    }
    public void deleteItem(String itemId) {
        itemList.removeIf(item -> item.getProductID().equals(itemId));
    }
    public void displayAllItems() {
        itemList.forEach(System.out::println);
    }

    public void searchItems(String condition) {
        for (T item : itemList) {
            if (item.toString().contains(condition)) {
                System.out.println(item);
            }
        }
    }

    public abstract void exportToExcel();

    public abstract void importFromExcel();

}
