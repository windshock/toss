// entry=0xf2ee4

void FUN_001f2ee4(void)

{
  undefined8 uVar1;
  uint uVar2;
  undefined2 uVar3;
  
  uVar1 = tpidr_el0;
  uVar2 = -(int)DAT_00285dc0;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(-0x4a7cf304 - (int)DAT_00285dc0) * 300 +
                     (long)(int)((uVar2 ^ 0xb5830dcd) + (uVar2 & 0x35830dcd) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x001f4528. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b850)(uVar3);
  return;
}


