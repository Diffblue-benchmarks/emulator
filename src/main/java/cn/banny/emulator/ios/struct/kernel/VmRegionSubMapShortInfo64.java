package cn.banny.emulator.ios.struct.kernel;

import cn.banny.emulator.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class VmRegionSubMapShortInfo64 extends UnicornStructure {

    public VmRegionSubMapShortInfo64(Pointer p) {
        super(p);
    }

    public int protection; /* present access protection */
    public int max_protection; /* max avail through vm_prot */
    public int inheritance; /* behavior of map/obj on fork */

    public int offset; /* offset into object/map */
    public int userTag; /* user tag on map entry */
    public int refCount; /* obj/map mappers, etc */

    public short shadowDepth; /* only for obj */
    public byte externalPager; /* only for obj */
    public byte shareMode; /* see enumeration */

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("protection", "max_protection", "inheritance", "offset", "userTag", "refCount", "shadowDepth", "externalPager", "shareMode");
    }

}
