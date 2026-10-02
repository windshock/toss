// entry=0xf0708

undefined8 Hf0708(long *param_1)

{
  bool bVar1;
  undefined8 uVar2;
  long *in_x9;
  uint uVar3;
  long in_x10;
  long *in_x11;
  uint uVar4;
  char *in_x12;
  char in_w14;
  char cVar5;
  
  do {
    cVar5 = in_w14;
    if (in_w14 == *in_x12) {
                    /* WARNING: Could not recover jumptable at 0x001f0c1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar2 = (*(code *)PTR_LAB_002797b8)();
      return uVar2;
    }
    do {
      if (cVar5 == *in_x12) {
        param_1 = (long *)param_1[0xd];
        in_x9 = (long *)in_x9[0xd];
        bVar1 = param_1 != (long *)0x0;
        uVar3 = (uint)bVar1;
        uVar4 = (uint)(in_x9 != (long *)0x0);
        if (bVar1 != (in_x9 == (long *)0x0) && bVar1) {
          in_x10 = *param_1;
          in_x11 = param_1 + 4;
          goto LAB_001f08d8;
        }
LAB_001f0bac:
                    /* WARNING: Could not recover jumptable at 0x001f0bc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (*(code *)PTR_LAB_0027a3c8)(uVar3 & uVar4 | uVar3 ^ uVar4);
        return uVar2;
      }
      do {
        if (*(char *)((long)in_x9 + 0x62) == '\0') {
          return 1;
        }
        in_x9 = (long *)in_x9[0xd];
        uVar4 = -((uint)DAT_00283668 & 1);
        if (in_x9 == (long *)0x0) {
          uVar3 = 1;
          goto LAB_001f0bac;
        }
LAB_001f08d8:
      } while (in_x10 != *in_x9);
      in_x12 = (char *)in_x9[4];
      in_w14 = *(char *)*in_x11;
      cVar5 = -0x31 - (-(char)DAT_00283668 ^ 0xffU);
    } while (in_w14 == '\0');
  } while( true );
}


