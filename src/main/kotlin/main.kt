fun main(args: Array<String>) {
    var enemy = BaseEnemy()
    var computedDamage = enemy.takeDamage()

    println("computeDamaged enemy= $computedDamage")

    var enemyWithArmour = ArmourDecorator(enemy)
    computedDamage = enemyWithArmour.takeDamage()
    println("computeDamaged enemyWithArmour= $computedDamage")

    var enemyWithHelmet = HelmetDecorator(enemy)
    computedDamage = enemyWithHelmet.takeDamage()
    println("computeDamaged enemyWithHelmet= $computedDamage")

    var enemyWithArmourAndHelmet = HelmetDecorator(enemyWithArmour)
    computedDamage = enemyWithArmourAndHelmet.takeDamage()
    println("computeDamaged enemyWithArmourAndHelmet= $computedDamage")

    var enemyWithArmourAndGlove = GloveDecorator(enemyWithArmour)
    computedDamage = enemyWithArmourAndGlove.takeDamage()
    println("computeDamaged enemyWithArmourAndGlove= $computedDamage")

    var enemyWithGlove = GloveDecorator(enemy)
    var enemyWithGloveAndArmour = ArmourDecorator(enemyWithGlove)
    computedDamage = enemyWithGloveAndArmour.takeDamage()
    println("computeDamaged enemyWithGloveAndArmour= $computedDamage")


}