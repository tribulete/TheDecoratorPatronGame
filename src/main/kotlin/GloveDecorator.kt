class GloveDecorator : EnemyDecorator{

    constructor( enemy : Enemy) :super(enemy) {
        this.enemy = enemy
    }

    override fun takeDamage(): Float {
        return this.enemy.takeDamage() - 2f
    }

}