// Components styles
import { SubTitle, TitleStyled } from "./style";

export default function Title(props) {
  return (
    <>
      <TitleStyled>{props.title}</TitleStyled>
      <SubTitle>{props.subTitle}</SubTitle>
    </>
  );
}
