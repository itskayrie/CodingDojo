import React, { useState } from 'react';


const types = ['tab1', 'tab2', 'tab3'];

const TabGroup = () => {
  const [active, setActive] = useState(types[0]);
  const rendercontent=()=>{
    switch(active){
      
      case 'tab1':
        return <p>Content for Tab 1</p>;
      case 'tab2':
        return <p>Content for Tab 2</p>;
      case 'tab3':
        return <p>Content for Tab 3</p>;
      default:
        return null;
    }
  }

  return (
    <>
      <div className="tab-container">
        {types.map((type) => (
          <button
            key={type}
            className={active === type ? 'tab active' : 'tab'}
            onClick={() => setActive(type)}
          >
            {type}
          </button>
        ))}
      </div>
      {rendercontent() }
    </>
  );
};

export default TabGroup;