package chapter07.sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        // 부모 클래스에 있던 필드
        System.out.println("dmbCellPhone.model = " + dmbCellPhone.model);
        System.out.println("dmbCellPhone.color = " + dmbCellPhone.color);

        // 본인한테 있는 클래스의 필드
        System.out.println("dmbCellPhone.channel = " + dmbCellPhone.channel);

        // 부모 클래스에 있던 메소드
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("~~");
        dmbCellPhone.hangUp();

        // 본인한테 있는 클래스의 메소드
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
