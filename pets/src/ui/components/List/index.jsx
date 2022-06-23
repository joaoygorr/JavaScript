import { Button } from "@mui/material";
// Components styles
import {
  Description,
  Information,
  ItenList,
  ListStyled,
  Name,
  Photo,
} from "./style";

export default function List() {
  return (
    <ListStyled>
      <ItenList>
        <Photo src={"#"} />
        <Information>
          <Name>bidu</Name>
          <Description>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem unde ad
            quisquam numquam sed ipsum distinctio quas, ut voluptatibus harum,
            facere placeat tempora! Quidem corrupti saepe odit delectus
            doloremque quis?
          </Description>
          <Button variant={"contained"}>Adotar</Button>
        </Information>
      </ItenList>
    </ListStyled>
  );
}
