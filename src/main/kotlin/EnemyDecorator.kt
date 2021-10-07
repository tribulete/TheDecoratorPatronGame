abstract class EnemyDecorator : Enemy {

    var enemy : Enemy

    constructor( enemy : Enemy) {
        this.enemy = enemy
    }

    override fun takeDamage(): Float {
        return this.enemy.takeDamage()
    }
}