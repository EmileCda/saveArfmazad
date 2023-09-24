import { useStore } from "@nanostores/react";
import background from "./../image/Vilankulous1.jpg";
import jsonData from "./../data/lang.json";
import { headerStore } from "../store/Header.store";
const myDataLang: any = jsonData;




export default function About(props: any) {
  const { lang, } = useStore(headerStore);
  
  return (
    <>
      <p>{`About [${lang}]`}</p>
      <img src={background} alt="background" />

      <p>`{myDataLang["langDesc"][lang]}`</p>
    </>
  );
}
