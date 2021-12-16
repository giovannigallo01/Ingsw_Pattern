package facade;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop huawei;
	
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		huawei = new Huawei();
	}
	
	public void iphoneSale() {
		iphone.modello();
		iphone.prezzo();
	}
	
	public void samsungSale() {
		samsung.modello();
		samsung.prezzo();
	}
	
	public void huaweiSale() {
		huawei.modello();
		huawei.prezzo();
	}
}
