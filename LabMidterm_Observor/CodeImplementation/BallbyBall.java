/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidterm;

/**
 *
 * @author TechEnclave Computer
 */
class BallByBallViewer implements MatchObserver {
    @Override
    public void update(Match match) {
        System.out.println("BallByBallViewer: Match status updated - " + match.getLiveStatus());
    }

    public void displayBallByBall() {
        System.out.println("BallByBallViewer: Displaying ball-by-ball coverage");
    }
}
