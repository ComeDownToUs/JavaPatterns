public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.menuItems = items;
    }
    public Object next(){
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext(){
        if(position>=menuItems.length || menuItems[position]==null)
            return false;
        else
            return true;
    }
}