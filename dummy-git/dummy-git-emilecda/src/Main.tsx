import { StrictMode } from "react";
import { CarouselContainer, MainContainer, Packages, Services } from "../style/Main.style";
/**
 * this component is in charge to display the main
 * main containt caroussel, services, package
 *
 */



export function Carousel() {
  return (
    <CarouselContainer>
          <img
            className="rien hide"
            height="200rem"
            src="./src/image/Vilankulous1.jpg"
            alt="image de vilankulous "
          ></img>
          <img
            className="rien"
            height="200rem"
            src="./src/image/Vilankulous2.jpg"
            alt="image de vilankulous "
          ></img>
          <img
            className="rien hide"
            height="200rem"
            src="./src/image/Vilankulous3.jpg"
            alt="image de vilankulous "
          ></img>
      <p>Existentia</p>
    </CarouselContainer>
  );
}


export default function Main() {
  return (
    <>
      <MainContainer>
        <Carousel />
        <Services />
        <Packages />
      </MainContainer>
    </>
  );
}
