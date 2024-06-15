package Advance;

public enum Enum {
    RED("红色"),
    GREEN("绿色"),
    BLUE("蓝色"),
    YELLOW("黄色"),
    ORANGE("橙色"),
    PURPLE("紫色");

    private final String description;

    // 枚举的构造器是私有的，防止外部代码创建枚举实例
    private Enum(String description) {
        this.description = description;
    }

    // 获取枚举值的描述
    public String getDescription() {
        return description;
    }

    // 示例方法，根据枚举值返回描述
    public static String getDescriptionByColor(Enum color) {
        if (color != null) {
            return color.getDescription();
        } else {
            return "未知颜色";
        }
    }

    public static void main(String[] args) {
        // 使用枚举并打印其描述
        System.out.println(Enum.RED.getDescription());    // 输出: 红色
        System.out.println(Enum.GREEN.getDescription()); // 输出: 绿色

        // 使用静态方法根据枚举值获取描述
        System.out.println(Enum.getDescriptionByColor(Enum.GREEN)); // 输出: 蓝色
        System.out.println(Enum.getDescriptionByColor(null));       // 输出: 未知颜色
    }
}
