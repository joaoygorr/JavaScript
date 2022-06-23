// Components
import List from "../ui/components/List";
import Title from "../ui/components/Title";

const Home = () => {
  return (
    <div>
      <Title
        title=""
        subTitle={
          <span>
            Com um pequeno valor mensal, você <br />
            <strong>pode adotar um pet virtualmente</strong>
          </span>
        }
      />
      <List />
    </div>
  );
};

export default Home;
