class HelmetDecorator : EnemyDecorator {

    constructor( enemy : Enemy) :super(enemy) {
        this.enemy = enemy
    }

    override fun takeDamage(): Float {
        return 0f
    }
}