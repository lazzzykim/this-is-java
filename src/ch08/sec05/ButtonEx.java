package ch08.sec05;

public class ButtonEx {
    public static void main(String[] args) {

        Button btnOk = new Button();

        // OK 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("cancel button 클릭");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
